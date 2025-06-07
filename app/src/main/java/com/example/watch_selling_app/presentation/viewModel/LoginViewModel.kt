package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.watch_selling_app.domain.model.LoginContent
import com.example.watch_selling_app.domain.model.LoginFormData
import com.example.watch_selling_app.domain.model.LoginFormTextContent
import com.example.watch_selling_app.domain.repository.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: LoginRepository
) : ViewModel() {

    private val _formData = MutableStateFlow(repository.getInitialLoginForm())
    val formData: StateFlow<LoginFormData> = _formData

    private val _loginContent = MutableStateFlow<LoginContent?>(null)
    val loginContent: StateFlow<LoginContent?> = _loginContent

    private val _loginFormText = MutableStateFlow<LoginFormTextContent?>(null)
    val loginFormText: StateFlow<LoginFormTextContent?> = _loginFormText

    init {
        _loginContent.value = repository.getLoginContent()
        _loginFormText.value = repository.getLoginFormTextContent()
    }

    fun onEmailChanged(newEmail: String) {
        _formData.value = _formData.value.copy(email = newEmail)
    }

    fun onPasswordChanged(newPassword: String) {
        _formData.value = _formData.value.copy(password = newPassword)
    }

    fun onRememberMeChanged(checked: Boolean) {
        _formData.value = _formData.value.copy(rememberMe = checked)
    }
}
