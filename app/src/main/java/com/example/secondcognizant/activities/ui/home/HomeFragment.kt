package com.example.secondcognizant.activities.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.secondcognizant.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    var TAG = HomeFragment::class.java.simpleName

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG,"Homefragment ondestroyview")

        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG,"Homefragment ondetach")

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG,"Homefragment onactivitycreated")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"Homefragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"Homefragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"Homefragment onpause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"Homefragment onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"Homefragment ondestroy")

    }
}