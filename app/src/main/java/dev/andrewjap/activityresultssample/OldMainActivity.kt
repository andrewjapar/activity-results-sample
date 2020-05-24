package dev.andrewjap.activityresultssample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Designed and developed by Andrew Japar (@andrewjapar)
 *
 */

class OldMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_PERMISSION -> {
                    // Do something if success / failed
                }
                REQUEST_MULTIPLE_PERMISSION -> {
                    // Do something if success / failed
                }
                REQUEST_TO_POST -> {
                    // Parse result and do something
                }
            }
        }

        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object {
        const val REQUEST_PERMISSION = 1001
        const val REQUEST_MULTIPLE_PERMISSION = 1002
        const val REQUEST_TO_POST = 1003
    }
}