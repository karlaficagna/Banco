package br.com.dionataferraz.vendas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dionataferraz.vendas.account.AccountActivity
import br.com.dionataferraz.vendas.databinding.ActivityHomeBinding
import br.com.dionataferraz.vendas.transaction.TransactionsActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityHomeBinding.inflate(layoutInflater).run {
            binding = this
            setContentView(root)
            viewModel = HomeViewModel()
        }

        binding.btNovaCompra.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)

        }

        binding.tvAccountPlaceHolder.setOnClickListener{
           val intent = Intent(this, TransactionsActivity::class.java)
            startActivity(intent)
        }
    }
}