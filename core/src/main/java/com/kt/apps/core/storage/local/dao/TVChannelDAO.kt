package com.kt.apps.core.storage.local.dao

import android.app.SearchManager
import android.database.Cursor
import android.provider.BaseColumns
import androidx.room.*
import com.kt.apps.core.storage.local.dto.TVChannelEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

@Dao
abstract class TVChannelDAO {

    @Query(
        "SELECT " +
                "channelPreviewProviderId as ${BaseColumns._ID}, " +
                "channelPreviewProviderId as ${SearchManager.SUGGEST_COLUMN_INTENT_DATA_ID}, " +
                "tvChannelName as ${SearchManager.SUGGEST_COLUMN_TEXT_1}, " +
                "tvGroup as ${SearchManager.SUGGEST_COLUMN_TEXT_2}, " +
                "tvGroup as ${SearchManager.SUGGEST_COLUMN_RESULT_CARD_IMAGE}, " +
                "channelPreviewProviderId as ${SearchManager.SUGGEST_COLUMN_DURATION} " +
                "FROM TVChannelEntity WHERE :title LIKE '%'"
    )
    abstract fun contentProviderQuery(title: String): Cursor?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(tvChannel: TVChannelEntity): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(list: List<TVChannelEntity>): Completable

    @Update
    abstract fun update(tvChannel: TVChannelEntity): Completable

    @Delete
    abstract fun delete(tvChannel: TVChannelEntity): Completable

    @Query("SELECT * from TVChannelEntity")
    abstract fun getAll(): Observable<List<TVChannelEntity>>
}