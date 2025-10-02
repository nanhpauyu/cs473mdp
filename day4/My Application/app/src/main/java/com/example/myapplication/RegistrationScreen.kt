package com.example.myapplication

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            var content = LocalContext.current
            var username by remember { mutableStateOf("") }
            var usernameError by remember { mutableStateOf(false) }
            TextField(
                value = username,
                onValueChange = { data ->
                    username = data
                },
                label = { Text(text = "Username") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                supportingText = {
                    if (usernameError) {
                        Text(text = "Username is required")
                    }
                },
                isError = usernameError,
                trailingIcon = {
                    if (usernameError) {
                        Text(text = "Error", color = MaterialTheme.colorScheme.error)
                    }
                }
            )
            var password by remember { mutableStateOf("") }
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = { Text(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                ),
                visualTransformation = PasswordVisualTransformation()
            )
            var phoneNumber by remember { mutableStateOf("") }
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = {
                    phoneNumber = it
                },
                label = { Text(text = "Phone Number") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
            )
            var genders = listOf("Male", "Female")
            var selectedGender by remember { mutableStateOf(genders[0]) }
            genders.forEach { gender ->
                RadioButton(
                    selected = gender == selectedGender,
                    onClick = {
                        selectedGender = gender
                    },
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = gender,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {}
                ) {
                    Text(
                        text = "Clear"
                    )
                }
                Button(
                    onClick = {}
                ) {
                    Text(
                        text = "Forgot Password"
                    )
                }
                Button(
                    onClick = {
                        if (username.isEmpty()) {
                            usernameError = true
                            return@Button
                        } else {
                            usernameError = false
                        }

                        val toast =
                            Toast.makeText(
                                content,
                                "Register Successfully $username",
                                Toast.LENGTH_SHORT
                            )
                        toast.show()
                    }
                ) {
                    Text(
                        text = "Register"
                    )
                }

            }
        }

    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RegistrationScreenPreview(modifier: Modifier = Modifier) {
    RegistrationScreen()
}