package beepbeep.pixelsforredditx.ui.comment.di

import beepbeep.pixelsforredditx.ui.comment.CommentRepo
import dagger.Module
import dagger.Provides

@Module
class CommentModule() {
    @Provides
    fun provideRepo(): CommentRepo {
        return CommentRepo()
    }
}
