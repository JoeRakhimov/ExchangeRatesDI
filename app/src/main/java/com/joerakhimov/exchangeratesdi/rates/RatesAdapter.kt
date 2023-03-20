package com.joerakhimov.exchangeratesdi.rates

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joerakhimov.exchangeratesdi.R
import kotlinx.android.synthetic.main.listitem_rate.view.*

class RatesAdapter(
    private val rates: List<RatesItem>
) :
    RecyclerView.Adapter<RatesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.listitem_rate, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val rate = rates[position]
        viewHolder.itemView.text_code.text = rate.code
        viewHolder.itemView.text_rate.text = rate.rate.toString()
    }

    override fun getItemCount() = rates.size

}