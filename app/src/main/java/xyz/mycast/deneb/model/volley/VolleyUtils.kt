package xyz.mycast.deneb.model.volley

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

object VolleyUtils {

    private const val TAG = "DNB/VolleyUtil"

    fun testVolley(context: Context, success: (Boolean) -> Unit) {

        val queue = Volley.newRequestQueue(context)
        val url = "https://jsonplaceholder.typicode.com/todos/1"

        val stringRequest = StringRequest(Request.Method.GET, url,
            { response ->
                Log.d(TAG, "hello: $response")
                success.invoke(true)
            },
            {
                Log.d(TAG, "error")
                success.invoke(false)
            }
        )
        queue.add(stringRequest)
    }
}