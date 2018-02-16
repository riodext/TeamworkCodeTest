package com.kotlin.aria.teamwork.base.basemvp;

/**
 * Created by aria on 11/02/2018.
 */

class MvpException extends RuntimeException {

    MvpException(String message) {
        super(message);
    }

    MvpException(String message, Throwable cause) {
        super(message, cause);
    }

    MvpException(Throwable cause) {
        super(cause);
    }
}
