package com.unifynd.frt.hapticfeedbackdemo.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import com.immersion.uhl.Launcher
import com.unifynd.frt.hapticfeedbackdemo.databinding.LayoutHapticButtonItemBinding
import com.unifynd.frt.hapticfeedbackdemo.utils.Constants

/**
 * Created by Harsh Rajgor on 29/12/20.
 */

class HapticAdapter(private val list: Array<Constants.ImmersionHapticsMapping>, private val launcher: Launcher, private val myContext: Context) : RecyclerView.Adapter<HapticAdapter.HapticViewHolder>() {

    private lateinit var binding: LayoutHapticButtonItemBinding

    inner class HapticViewHolder(private val binding: LayoutHapticButtonItemBinding) : RecyclerView.ViewHolder(binding.root) {


        @SuppressLint("ClickableViewAccessibility")
        fun bind(btnHaptic: AppCompatButton, hapticId: Int, hapticName: String) {
            btnHaptic.setOnClickListener {
                startVibration(hapticId)
                Toast.makeText(myContext, hapticName, Toast.LENGTH_SHORT).show()
            }
        }

        private fun stopVibration() {
            launcher.stop()
        }

        private fun startVibration(hapticId: Int) {
            stopVibration()
            launcher.play(hapticId)
        }

    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HapticViewHolder {
        binding = LayoutHapticButtonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HapticViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HapticViewHolder, position: Int) {
        val currentHaptic = list[position]
        if (!::binding.isInitialized) return
        binding.btnHaptic.text = currentHaptic.hapticId.toString()
        holder.bind(binding.btnHaptic, currentHaptic.hapticId, currentHaptic.hapticName)
    }

    override fun getItemCount(): Int = list.size

}