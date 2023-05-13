package com.programminghut.realtime_object

import android.graphics.Bitmap
import android.view.TextureView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun MainScreen(state: FirstState, bitmap: Bitmap, textureView: TextureView) {

    Column(modifier = Modifier.fillMaxSize()) {
        BitmapImage(bitmap = bitmap)
    }
    CameraPreviewTextureView(textureView = textureView)
}

@Composable
fun BitmapImage(bitmap: Bitmap) {
    Image(
        bitmap = bitmap.asImageBitmap(),
        contentDescription = "some useful description",
    )
}

@Composable
fun CameraPreviewTextureView(textureView: TextureView) {
    AndroidView(
        factory = { textureView },
        modifier = Modifier.fillMaxSize()
    )
}