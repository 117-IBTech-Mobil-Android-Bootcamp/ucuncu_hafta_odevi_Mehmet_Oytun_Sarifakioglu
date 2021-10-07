package com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.R
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.model.Data
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.util.imageView
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.util.stringView

class AvatarViewModel: ViewModel() {

    val dataset= MutableLiveData<List<Data>>()

    fun getData()
    {
        val string=Data(stringView, R.string.data_text_for_recycler,null)
        val user_1=Data(imageView, null,R.drawable.ic_avatar01)
        val user_2=Data(imageView, null,R.drawable.ic_avatar02)
        val user_3=Data(imageView, null,R.drawable.ic_avatar03)
        val user_4=Data(imageView, null,R.drawable.ic_avatar04)
        val user_5=Data(imageView, null,R.drawable.ic_avatar05)
        val user_6=Data(imageView, null,R.drawable.ic_avatar06)
        val user_7=Data(imageView, null,R.drawable.ic_avatar07)
        val user_8=Data(imageView, null,R.drawable.ic_avatar08)
        val user_9=Data(imageView, null,R.drawable.ic_avatar09)
        val user_10=Data(imageView, null,R.drawable.ic_avatar01)
        val user_11=Data(imageView, null,R.drawable.ic_avatar02)
        val user_12=Data(imageView, null,R.drawable.ic_avatar03)
        val user_13=Data(imageView, null,R.drawable.ic_avatar07)
        val user_14=Data(imageView, null,R.drawable.ic_avatar03)
        val user_15=Data(imageView, null,R.drawable.ic_avatar01)
        val user_16=Data(imageView, null,R.drawable.ic_avatar09)

        val dataList= arrayListOf(string,user_1,user_2,user_3,user_4,user_5,user_6,user_7,user_8,user_9,user_10,user_11,user_12,user_13,user_14,user_15,user_16)

        dataset.value=dataList
    }

}