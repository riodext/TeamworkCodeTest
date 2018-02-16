package com.kotlin.aria.teamwork.di.module

import com.kotlin.aria.teamwork.BuildConfig
import com.kotlin.aria.teamwork.data.typelist.network.ProjectListResponseMapper
import com.kotlin.aria.teamwork.data.typelist.repositoryimp.network.ProjectListRepositoryNetworkImp
import com.kotlin.aria.teamwork.data.typelist.repositoryimp.network.service.ProjectListService
import com.kotlin.aria.teamwork.domain.main.repository.ProjectListRepository
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton


/**
 * Created by aria on 11/02/2018.
 */
@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideCompositeDisposable() = CompositeDisposable()

    @Singleton
    @Provides
    @Named("baseEndpoint")
    fun baseEndpoint() = "http://yat.teamworkpm.net/"

    @Singleton
    @Provides
    fun provideOkHttpBuilder(): OkHttpClient.Builder {
        val okHttpBuilder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            okHttpBuilder.addInterceptor(logging)
        }
        okHttpBuilder.readTimeout(15.toLong(), TimeUnit.SECONDS)
        okHttpBuilder.connectTimeout(15.toLong(), TimeUnit.SECONDS)
        okHttpBuilder.addInterceptor(
                AuthInterceptor("yat@triplespin.com", "yatyatyat27"))

        return okHttpBuilder
    }

    @Singleton
    @Provides
    fun provideRetrofit(retrofitBuilder: Retrofit.Builder,
                        okHttpClientBuilder: OkHttpClient.Builder,
                        @Named("baseEndpoint") baseUrl: String): Retrofit {
        val client = okHttpClientBuilder.build()
        return retrofitBuilder
                .client(client)
                .baseUrl(baseUrl)
                .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }

    @Singleton
    @Provides
    fun provideProjectListRepositoryImp(
            service: ProjectListService,
            listMapper: ProjectListResponseMapper): ProjectListRepository =
                ProjectListRepositoryNetworkImp(service, listMapper)

    @Singleton
    @Provides
    fun provideTypeListService(retrofit: Retrofit): ProjectListService =
            retrofit.create(ProjectListService::class.java)

    @Singleton
    @Provides
    fun providesTypeListMapper(): ProjectListResponseMapper = ProjectListResponseMapper()

}