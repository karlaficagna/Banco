package br.com.dionataferraz.vendas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.dionataferraz.vendas.databinding.ItemListBinding
import br.com.dionataferraz.vendas.transaction.data.local.TransactionEntity

class TransactionAdapter() :
    RecyclerView.Adapter<TransactionViewHolder>() {


    private val listItem: MutableList<TransactionEntity> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val item = listItem[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }
    fun addNewList(list: List<TransactionEntity>) {
        listItem.clear()
        notifyItemRangeRemoved(0, listItem.size)
        listItem.addAll(list)
    }

    fun addList(list: List<TransactionEntity>) {
        listItem.addAll(list)
    }

}
class TransactionViewHolder(
    private val binding: ItemListBinding,
 ): RecyclerView.ViewHolder(binding.root) {

    fun bind(transaction: TransactionEntity) {
        binding.tvName.text = transaction.saldoConta.toString()
    }
}