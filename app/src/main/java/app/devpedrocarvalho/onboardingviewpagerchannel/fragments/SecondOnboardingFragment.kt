package app.devpedrocarvalho.onboardingviewpagerchannel.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import app.devpedrocarvalho.onboardingviewpagerchannel.R

class SecondOnboardingFragment : Fragment() {

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_second_onboarding, container, false)
        val btn: ImageView = view.findViewById(R.id.secondButtonImageView)
        viewPager = activity!!.findViewById(R.id.onboardingViewPager)

        btn.setOnClickListener {
            if (viewPager.currentItem == 1) {
                viewPager.currentItem = viewPager.currentItem + 1
            } else {
                // Otherwise, select the previous step.
                viewPager.currentItem = viewPager.currentItem - 1
            }
        }

        return view
    }

}