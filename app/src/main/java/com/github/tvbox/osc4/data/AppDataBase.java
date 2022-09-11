package com.github.tvbox.osc4.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.github.tvbox.osc4.cache.Cache;
import com.github.tvbox.osc4.cache.CacheDao;
import com.github.tvbox.osc4.cache.StorageDrive;
import com.github.tvbox.osc4.cache.StorageDriveDao;
import com.github.tvbox.osc4.cache.VodCollect;
import com.github.tvbox.osc4.cache.VodCollectDao;
import com.github.tvbox.osc4.cache.VodRecord;
import com.github.tvbox.osc4.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class, StorageDrive.class}, version = 2)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();

    public abstract StorageDriveDao getStorageDriveDao();
}
