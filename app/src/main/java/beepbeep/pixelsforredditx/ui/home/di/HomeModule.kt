package beepbeep.pixelsforredditx.ui.home.di

import beepbeep.pixelsforredditx.PixelApplication
import beepbeep.pixelsforredditx.ui.home.HomeRepo
import dagger.Module
import dagger.Provides

@Module
class HomeModule() {
    @Provides
    fun provideRepo(application: PixelApplication): HomeRepo {
        return HomeRepo(application)
    }
}
