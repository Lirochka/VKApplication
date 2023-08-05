package com.example.vkapplication.presentation.main

sealed class AuthState{

    object Authorized: AuthState()

    object NotAuthorized: AuthState()

    object Initial: AuthState()
}
