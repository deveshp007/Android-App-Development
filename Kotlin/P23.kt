package alpha.dex.dexsix

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

class CameraPicture : AppCompatActivity() {
    lateinit var requestCamera: ActivityResultLauncher<String>
    lateinit var imageCapture: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_picture)

        var btnCamera = findViewById<Button>(R.id.btnCamera)

        requestCamera = registerForActivityResult(ActivityResultContracts.RequestPermission())
        {
            if (it) {
                Toast.makeText(applicationContext, "Permission Granted", Toast.LENGTH_LONG).show()
                cameraCall()
            } else
                Toast.makeText(applicationContext, "Permission Denied", Toast.LENGTH_LONG).show()
        }
        imageCapture =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult())
            {
                if (it.resultCode == Activity.RESULT_OK) {
                    handleCameraImage(it.data)
                }
            }

        btnCamera.setOnClickListener {
            callPermission()
        }
    }

    fun cameraCall() {
        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        imageCapture.launch(camera_intent)
    }

    fun handleCameraImage(intent: Intent?) {
        var imageCamera = findViewById<ImageView>(R.id.imageCamera)
        val bitmap = intent?.extras?.get("data") as Bitmap
        imageCamera.setImageBitmap(bitmap)
    }

    fun callPermission() {
        when {
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                    == PackageManager.PERMISSION_GRANTED -> {
                Toast.makeText(applicationContext, "Permission Granted Already", Toast.LENGTH_LONG)
                    .show()
                cameraCall()
            }
            else -> {
                requestCamera.launch(android.Manifest.permission.CAMERA)
            }

        }
    }
}