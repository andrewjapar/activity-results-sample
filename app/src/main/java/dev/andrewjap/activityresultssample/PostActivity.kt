package dev.andrewjap.activityresultssample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_post.*

/**
 * Designed and developed by Andrew Japar (@andrewjapar)
 *
 */

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        back_with_data.setOnClickListener {
            val intent = Intent().apply {
                putExtra(TITLE, "hello")
            }

            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    companion object {
        const val TITLE = "title"
        const val ID = "id"

        fun getIntent(context: Context, postId: Int): Intent {
            return Intent(context, PostActivity::class.java).apply {
                putExtra(ID, postId)
            }
        }
    }
}