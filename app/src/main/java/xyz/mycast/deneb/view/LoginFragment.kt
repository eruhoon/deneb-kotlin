package xyz.mycast.deneb.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import xyz.mycast.deneb.R
import xyz.mycast.deneb.databinding.FragmentLoginBinding
import xyz.mycast.deneb.model.volley.VolleyUtils

class LoginFragment : Fragment() {

    companion object {
        private const val TAG = "DNB/LoginFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentLoginBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val submitButton: Button = view.findViewById(R.id.button_submit)
        submitButton.setOnClickListener {
            VolleyUtils.testVolley(requireContext()) { success ->
                Log.d(TAG, "result: $success")
            }
        }
    }
}