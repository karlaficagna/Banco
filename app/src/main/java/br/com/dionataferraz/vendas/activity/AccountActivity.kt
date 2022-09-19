package br.com.dionataferraz.vendas.activity

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.dionataferraz.vendas.databinding.ActivityLoginBinding
import br.com.dionataferraz.vendas.databinding.ActivityProfileBinding
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class AccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar = null
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        data class Account(
            val nomeConta: String,
            val saldoConta: Double,
            val nomeResponsavel: String
        )

        fun salvaInformacoesConta() {
            val sharedPreferences = getSharedPreferences(
                "Account",
                MODE_PRIVATE
            )
            val edit = sharedPreferences.edit()

            edit.putString("nameConta", "Minhas Compras")
            edit.putLong("saldoConta", 2000L)
            edit.putString("nameResponsavelConta", "Karla")
            edit.apply()


        }
    }
}



