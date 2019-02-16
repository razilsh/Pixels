package beepbeep.pixelsforredditx.home.di

import beepbeep.pixelsforredditx.PixelApplication
import beepbeep.pixelsforredditx.home.HomeRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HomeModule() {
    @Provides
    fun provideRepo(application: PixelApplication): HomeRepo {
        return HomeRepo(application)
    }
}
