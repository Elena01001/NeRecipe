package ru.netology.nerecipe.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.onNavDestinationSelected
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.netology.nerecipe.R
import androidx.navigation.ui.setupActionBarWithNavController
import ru.netology.nerecipe.databinding.AppActivityBinding
import ru.netology.nerecipe.viewModel.RecipeViewModel


class AppActivity : AppCompatActivity() {

    /*private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration*/

    /* private val viewModel: RecipeViewModel by viewModels()
     private val feedFragment = FeedFragment()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AppActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //библиотека навигации, кот автоматически отслеживает нажатия на пункты меню и открывает нужный фрагмент
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setupWithNavController(navController)

//        // Setup the ActionBar with navController and 3 top level destinations
//        appBarConfiguration = AppBarConfiguration(
//            setOf(R.id.feedFragment, R.id.categoryFilterFragment, R.id.favouriteRecipeFragment)
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//
        navController.addOnDestinationChangedListener { _, _, arguments ->
            binding.bottomNavigation.isVisible =
                arguments?.getBoolean("ShowAppBar", false) == true
        }

    }
/*

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }
*/


}
