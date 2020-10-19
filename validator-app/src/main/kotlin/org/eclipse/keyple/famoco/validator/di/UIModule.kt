/********************************************************************************
 * Copyright (c) 2020 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information regarding copyright
 * ownership.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.keyple.famoco.validator.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.eclipse.keyple.famoco.validator.di.scopes.ActivityScoped
import org.eclipse.keyple.famoco.validator.ui.activities.CardReaderActivity
import org.eclipse.keyple.famoco.validator.ui.activities.CardSummaryActivity

@Module
abstract class UIModule {
    @ActivityScoped
    @ContributesAndroidInjector
    abstract fun cardReaderActivity(): CardReaderActivity

    @ActivityScoped
    @ContributesAndroidInjector
    abstract fun cardSummaryActivity(): CardSummaryActivity
}