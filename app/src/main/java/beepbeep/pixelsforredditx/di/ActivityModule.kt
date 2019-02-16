package beepbeep.pixelsforredditx.di

import beepbeep.pixelsforredditx.home.HomeActivity
import beepbeep.pixelsforredditx.home.di.HomeModule
import beepbeep.pixelsforredditx.ui.comment.CommentActivity
import beepbeep.pixelsforredditx.ui.comment.di.CommentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun contributeMainActivity(): HomeActivity

    @ContributesAndroidInjector(modules = [CommentModule::class])
    abstract fun contributeSecondActivity(): CommentActivity
}
