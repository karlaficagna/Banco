package br.com.dionataferraz.vendas.account

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.dionataferraz.vendas.databinding.ActivityAccountBinding

class AccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccountBinding
    private lateinit var viewModel: AccountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = AccountViewModel()

        binding.btAdicionar.setOnClickListener {
            viewModel.addTransaction(binding.etSaldoConta.text.toString().toDouble())
        }
        binding.btExcluir.setOnClickListener {
            viewModel.withdrawTransaction(binding.etSaldoConta.text.toString().toDouble()
            )

        }
    }
}





