package com.espressif.iot.db.greenrobot.daos;

import com.espressif.iot.db.greenrobot.daos.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
import com.espressif.iot.object.db.IDownloadIdValueDB;

// KEEP INCLUDES END
/**
 * Entity mapped to table DOWNLOAD_ID_VALUE_DB.
 */
public class DownloadIdValueDB implements IDownloadIdValueDB {

    private Long id;
    private long idValue;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient DownloadIdValueDBDao myDao;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public DownloadIdValueDB() {
    }

    public DownloadIdValueDB(Long id) {
        this.id = id;
    }

    public DownloadIdValueDB(Long id, long idValue) {
        this.id = id;
        this.idValue = idValue;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDownloadIdValueDBDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdValue() {
        return idValue;
    }

    public void setIdValue(long idValue) {
        this.idValue = idValue;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
