package beepbeep.pixelsforredditx.di

import beepbeep.pixelsforredditx.home.HomeActivity
import beepbeep.pixelsforredditx.home.di.HomeModule
import beepbeep.pixelsforredditx.ui.comment.CommentActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun contributeMainActivity(): HomeActivity

    @ContributesAndroidInjector
    abstract fun contributeSecondActivity(): CommentActivity
}
