package beepbeep.pixelsforredditx.extension

import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

fun View.dpWidth(): Int {
    val density = resources.displayMetrics.density
    return (width / density).toInt()
}

fun View.dpHeight(): Int {
    val density = resources.displayMetrics.density
    return (height / density).toInt()
}

fun Snackbar.setTextColor(color: Int): Snackbar {
    // Nullability is required as the id could possibly change in future releases
    val tv = view.findViewById(com.google.android.material.R.id.snackbar_text) as? TextView
    tv?.setTextColor(color)

    return this
}
