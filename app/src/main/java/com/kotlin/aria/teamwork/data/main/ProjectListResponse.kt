package com.kotlin.aria.teamwork.data.main
import com.google.gson.annotations.SerializedName


/**
 * Created by aria on 15/02/2018.
 */

data class ProjectsResponse(
		@SerializedName("STATUS") val status: String, //OK
		@SerializedName("projects") val projects: List<ProjectItem>
)

data class ProjectItem(
		@SerializedName("replyByEmailEnabled") val replyByEmailEnabled: Boolean, //true
		@SerializedName("starred") val starred: Boolean, //true
		@SerializedName("show-announcement") val showAnnouncement: Boolean, //false
		@SerializedName("harvest-timers-enabled") val harvestTimersEnabled: Boolean, //false
		@SerializedName("status") val status: String, //active
		@SerializedName("subStatus") val subStatus: String, //current
		@SerializedName("defaultPrivacy") val defaultPrivacy: String, //open
		@SerializedName("integrations") val integrations: Integrations,
		@SerializedName("created-on") val createdOn: String, //2017-01-03T21:49:20Z
		@SerializedName("category") val category: Category,
		@SerializedName("filesAutoNewVersion") val filesAutoNewVersion: Boolean, //false
		@SerializedName("overview-start-page") val overviewStartPage: String, //default
		@SerializedName("tags") val tags: List<Tag>,
		@SerializedName("logo") val logo: String, //https://s3.amazonaws.com/TWFiles/349705/projectLogo/tf_49AEF502-ED21-1A9D-87FAE9BD9D485267.dota22.jpg
		@SerializedName("startDate") val startDate: String, //20140408
		@SerializedName("id") val id: String, //339988
		@SerializedName("last-changed-on") val lastChangedOn: String, //2018-02-10T16:18:00Z
		@SerializedName("endDate") val endDate: String, //20261025
		@SerializedName("defaults") val defaults: Defaults,
		@SerializedName("company") val company: Company,
		@SerializedName("tasks-start-page") val tasksStartPage: String, //default
		@SerializedName("name") val name: String, //Adamantium
		@SerializedName("privacyEnabled") val privacyEnabled: Boolean, //false
		@SerializedName("description") val description: String, //Adamantium is a fictional metal alloy appearing in American comic books published by Marvel Comics. It is best known as the substance bonded to the character Wolverine's skeleton and claws. Adamantium was created by writer Roy Thomas and artists Barry Windsor-Smith and Syd Shores in Marvel Comics' Avengers #66 (July 1969), which presents the substance as part of the character Ultron's outer shell. In the stories where it appears, the defining quality of adamantium is its practical indestructibilityilitty
		@SerializedName("announcement") val announcement: String,
		@SerializedName("isProjectAdmin") val isProjectAdmin: Boolean, //true
		@SerializedName("start-page") val startPage: String, //projectoverview
		@SerializedName("notifyeveryone") val notifyeveryone: Boolean, //false
		@SerializedName("announcementHTML") val announcementHTML: String
)

data class Company(
		@SerializedName("name") val name: String, //Cat
		@SerializedName("is-owner") val isOwner: String, //1
		@SerializedName("id") val id: String //113332
)

data class Tag(
		@SerializedName("name") val name: String, //API
		@SerializedName("id") val id: String, //58971
		@SerializedName("color") val color: String //#d84640
)

data class Integrations(
		@SerializedName("microsoftConnectors") val microsoftConnectors: MicrosoftConnectors,
		@SerializedName("onedrivebusiness") val onedrivebusiness: Onedrivebusiness
)

data class Onedrivebusiness(
		@SerializedName("enabled") val enabled: Boolean, //false
		@SerializedName("folder") val folder: String, //root
		@SerializedName("account") val account: String,
		@SerializedName("foldername") val foldername: String //root
)

data class MicrosoftConnectors(
		@SerializedName("enabled") val enabled: Boolean //false
)

data class Category(
		@SerializedName("name") val name: String, //mobile
		@SerializedName("id") val id: String, //26882
		@SerializedName("color") val color: String
)

data class Defaults(
		@SerializedName("privacy") val privacy: String
)