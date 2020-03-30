package com.example.quarantinetracker

interface FirebaseTargetListener {
    fun onTargetAdded(target: Target)
    fun onTargetRemoved(target: Target)
    fun onTargetUpdated(target: Target)
}

