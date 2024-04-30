package com.example.cadastroapptheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.example.cadastroapptheme.ui.theme.CadastroAppThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CadastroAppThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cadastro()
                }
            }
        }
    }
}

@Composable
fun cadastro() {
    var nome by remember { mutableStateOf("") }
    var Bairro by remember { mutableStateOf("")}
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("")}
    var Estado by remember { mutableStateOf("") }
    
    Column(
        Modifier
            .fillMaxWidth(),
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "App cadastro",
                fontsize = 20.sp
            )
        }
        
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
        )
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center 
        ) {
            Text(text = "App cadastro",
                fontSize = 20.sp
            )
        }
        
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
        )
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome, //Variavel: var nome by remember { mutableStateOf("")}
                onValueChange = {novoValor -> nome = novoValor},
                label = {Text( "Digite seu nome:")},
            )
        }
        Spacer(modifier = Modifier.height(16.dp)) //adicione espaco vertical
        
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = Bairro, //Variavel: var bairro by remember { mutableStateOf("")}
                onValueChange = {novoValor -> Bairro = novoValor},
                label = {Text("Digite o nome do seu Bairro:")}
            )
        }
        Spacer(modifier = Modifier.height(16.dp)) // adicione espaco vertical
        
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cep, //Variavel: var cep by remember { mutableStateOf("")}
                onValueChange = {novoValor -> cep = novoValor},
                label = {Text("Digite o seu CEP")}
            )
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaco vertical
        
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField (
                value = cidade, //Variavel: var cep by remember { mutableStateOf("")}
                onValueChange = {novoValor -> cidade = novoValor},
                label = {Text("Digite o nome da sua Cidade:")},
            )
        }
        Spacer(modifier = Modifier.height(16.dp)) //Adicione espaco vertical 

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = Estado, 
                onValueChange = {novoValor -> Estado = novoValor},
                label = {Text("Digite o nome do seu estado:")},
                shape = RoundedCornerShape(25.dp) // Raio de borda de 8dp
            )
        }    
        Spacer(modifier = Modifier.height(26.dp)) //adicione espaco vertical
        
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = {}) {
                Text(text = "Cadastrar")
            }
        }
        
    }
}

@Composable
fun height() {
    Spacer(modifier = Modifier.height(16.dp))
}

fun Text(text: String, fontsize: TextUnit) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun CadastroPreview() {
    CadastroAppThemeTheme {
        cadastro()
    }
}