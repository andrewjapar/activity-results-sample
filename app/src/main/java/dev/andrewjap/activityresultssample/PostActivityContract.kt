package dev.andrewjap.activityresultssample

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

/**
 * Designed and developed by Andrew Japar (@andrewjapar)
 *
 */

class PostActivityContract : ActivityResultContract<Int, String?>() {

    override fun createIntent(context: Context, input: Int): Intent {
        return PostActivity.getIntent(context, input)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        val data = intent?.getStringExtra(PostActivity.TITLE)
        return if (resultCode == Activity.RESULT_OK && data != null) data
        else null
    }
}