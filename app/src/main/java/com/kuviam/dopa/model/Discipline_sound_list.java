package com.kuviam.dopa.model;

import com.kuviam.dopa.model.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DISCIPLINE_SOUND_LIST".
 */
public class Discipline_sound_list {

    private Long id;
    private long disciplineId;
    /** Not-null value. */
    private byte[] item;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient Discipline_sound_listDao myDao;

    private Discipline discipline;
    private Long discipline__resolvedKey;


    public Discipline_sound_list() {
    }

    public Discipline_sound_list(Long id) {
        this.id = id;
    }

    public Discipline_sound_list(Long id, long disciplineId, byte[] item) {
        this.id = id;
        this.disciplineId = disciplineId;
        this.item = item;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDiscipline_sound_listDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(long disciplineId) {
        this.disciplineId = disciplineId;
    }

    /** Not-null value. */
    public byte[] getItem() {
        return item;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setItem(byte[] item) {
        this.item = item;
    }

    /** To-one relationship, resolved on first access. */
    public Discipline getDiscipline() {
        long __key = this.disciplineId;
        if (discipline__resolvedKey == null || !discipline__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DisciplineDao targetDao = daoSession.getDisciplineDao();
            Discipline disciplineNew = targetDao.load(__key);
            synchronized (this) {
                discipline = disciplineNew;
            	discipline__resolvedKey = __key;
            }
        }
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        if (discipline == null) {
            throw new DaoException("To-one property 'disciplineId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.discipline = discipline;
            disciplineId = discipline.getId();
            discipline__resolvedKey = disciplineId;
        }
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

}