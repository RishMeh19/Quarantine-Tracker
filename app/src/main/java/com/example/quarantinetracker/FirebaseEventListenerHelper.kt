package com.example.quarantinetracker

import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError

class FirebaseEventListenerHelper(private val firebaseTargetListener: FirebaseTargetListener) :
    ChildEventListener {
    override fun onCancelled(p0: DatabaseError) {
    }
    override fun onChildMoved(p0: DataSnapshot, p1: String?) {
    }
    override fun onChildChanged(p0: DataSnapshot, p1: String?) {
        val driver = p0.getValue(Target::class.java)
        firebaseTargetListener.onDriverUpdated(driver!!)
    }
    override fun onChildAdded(p0: DataSnapshot, p1: String?) {
        val driver = p0.getValue(Target::class.java)
        firebaseTargetListener.onDriverAdded(driver!!)
    }
    override fun onChildRemoved(p0: DataSnapshot) {
        val driver = p0.getValue(Target::class.java)
        firebaseTargetListener.onDriverRemoved(driver!!)
    }
}