package com.abdullahafzaldev.androidtopsheetview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.techisfun.android.topsheet.TopSheetBehavior
import com.github.techisfun.android.topsheet.TopSheetDialog
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openTopSheet(v: View?) {
        val sheet = findViewById<View>(R.id.top_sheet)
        TopSheetBehavior.from(sheet).state = TopSheetBehavior.STATE_EXPANDED
    }

    fun openBottomSheet(v: View?) {
        val sheet = findViewById<View>(R.id.bottom_sheet)
        BottomSheetBehavior.from(sheet).state = BottomSheetBehavior.STATE_EXPANDED
    }

    fun openTopSheetDialog(view: View?) {
        val dialog = TopSheetDialog(this)
        dialog.setContentView(R.layout.sheet_content)
        dialog.show()
    }

    fun openBottomSheetDialog(view: View?) {
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.sheet_content)
        bottomSheetDialog.show()
    }
}