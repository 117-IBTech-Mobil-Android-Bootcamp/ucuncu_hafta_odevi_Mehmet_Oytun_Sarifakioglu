package com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.base

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.MainActivity
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.R

abstract class BaseFragment : Fragment(), IBaseFragment {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(getLayoutID(), container, false)
    }

    override fun onResume() {
        super.onResume()
        //NavigationBar visibility control
        val baseActivity = activity as MainActivity
        if(isNavigationbarVisible())
            baseActivity.showNavigation()
        else
            baseActivity.hideNavigation()
    }

    override fun exitShowPopUp() {
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val alert= AlertDialog.Builder(requireContext())
                alert.setTitle(R.string.alert_pop_up_message_title_text)
                alert.setMessage(R.string.alert_pop_up_message_text)
                alert.setCancelable(false)
                alert.setNegativeButton(R.string.alert_pop_up_negative_button_text){ dialog, which ->
                    activity?.finish()
                }
                alert.setPositiveButton(R.string.alert_pop_up_positive_button_text){dialog,which ->
                    dialog.cancel()
                }.show()
            }
        })
    }
    abstract fun getLayoutID() : Int

}