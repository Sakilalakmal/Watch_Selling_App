package com.example.watch_selling_app.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.watch_selling_app.domain.model.RegisterContent
import com.example.watch_selling_app.domain.model.RegisterFormData
import com.example.watch_selling_app.domain.model.RegisterFormTextContent
import com.example.watch_selling_app.domain.repository.RegisterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val repository: RegisterRepository
) : ViewModel() {

    // UI content and text definitions
    val content: RegisterContent = repository.getRegisterContent()
    val formTextContent: RegisterFormTextContent = repository.getRegisterFormTextContent()

    // State: Form data
    private val _formData = MutableStateFlow(RegisterFormData())
    val formData: StateFlow<RegisterFormData> = _formData

    // --- Event handlers ---

    fun onNameChanged(newName: String) {
        _formData.value = _formData.value.copy(name = newName)
    }

    fun onEmailChanged(newEmail: String) {
        _formData.value = _formData.value.copy(email = newEmail)
    }

    fun onPasswordChanged(newPassword: String) {
        _formData.value = _formData.value.copy(password = newPassword)
    }

    fun onConfirmPasswordChanged(newConfirmPassword: String) {
        _formData.value = _formData.value.copy(confirmPassword = newConfirmPassword)
    }

    fun onMobileChanged(newMobile: String) {
        _formData.value = _formData.value.copy(mobile = newMobile)
    }


}