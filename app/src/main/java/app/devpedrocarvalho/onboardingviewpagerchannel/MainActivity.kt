package app.devpedrocarvalho.onboardingviewpagerchannel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import app.devpedrocarvalho.onboardingviewpagerchannel.adapter.OnboardingViewPagerAdapter
import app.devpedrocarvalho.onboardingviewpagerchannel.fragments.FirstOnboardingFragment
import app.devpedrocarvalho.onboardingviewpagerchannel.fragments.SecondOnboardingFragment
import app.devpedrocarvalho.onboardingviewpagerchannel.fragments.ThirdOnboardingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.onboardingViewPager)
        val pagerAdapter = OnboardingViewPagerAdapter(this)
        pagerAdapter.addFragment(FirstOnboardingFragment())
        pagerAdapter.addFragment(SecondOnboardingFragment())
        pagerAdapter.addFragment(ThirdOnboardingFragment())
        viewPager.adapter = pagerAdapter

    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

}