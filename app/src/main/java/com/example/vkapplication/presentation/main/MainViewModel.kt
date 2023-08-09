package com.example.vkapplication.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vkapplication.domain.usecases.CheckAuthStateUseCase
import com.example.vkapplication.domain.usecases.GetAuthStateFlowUseCase
import javax.inject.Inject
import kotlinx.coroutines.launch

class MainViewModel @Inject constructor
    ( private val getAuthStateFlowUsrCase: GetAuthStateFlowUseCase,
      private val checkAuthStateUseCase: CheckAuthStateUseCase)
    : ViewModel() {

    val authState = getAuthStateFlowUsrCase()
    fun performAuthResult() {
        viewModelScope.launch {
            checkAuthStateUseCase()
        }
    }
}