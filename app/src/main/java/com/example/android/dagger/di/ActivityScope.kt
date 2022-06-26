package com.example.android.dagger.di

import javax.inject.Scope

// The scope annotation should be named based on the lifetime it has
// since annotations can be reused by sibling components
@Scope
@MustBeDocumented
@Retention(value=AnnotationRetention.RUNTIME)
annotation class ActivityScope {
}