package com.example.secondcognizant.activities.ui.dashboard

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.secondcognizant.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
var TAG = DashboardFragment::class.java.simpleName
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG,"DBfragment onattach")

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"DBfragment oncreaete")

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i(TAG,"DBfragment oncreatevieww")

        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG,"DBfragment ondestroyview")

        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG,"DBfragment ondetach")

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG,"DBfragment onactivitycreated")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"DBfragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"DBfragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"DBfragment onpause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"DBfragment onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"DBfragment ondestroy")

    }
}