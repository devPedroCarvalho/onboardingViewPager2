package app.devpedrocarvalho.onboardingviewpagerchannel.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import app.devpedrocarvalho.onboardingviewpagerchannel.R


class FirstOnboardingFragment : Fragment() {


    private lateinit var viewPager: ViewPager2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_first_onboarding, container, false)
        val btn: ImageView = view.findViewById(R.id.firstButtonImageView)
        viewPager = activity!!.findViewById(R.id.onboardingViewPager)

        btn.setOnClickListener {
            if (viewPager.currentItem == 0) {
                viewPager.currentItem = viewPager.currentItem + 1
            } else {
                viewPager.currentItem = viewPager.currentItem - 1
            }
        }

        return view
    }

}