package ru.gorniygor.blankrecognition.util

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by Gor on 22.06.2018.
 */

fun AppCompatActivity.showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
fun Fragment.showToast(message: String) {
    if(context != null)
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}