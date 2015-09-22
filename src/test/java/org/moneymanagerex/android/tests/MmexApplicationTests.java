/*
 * Copyright (C) 2012-2015 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.moneymanagerex.android.tests;

import android.content.Context;
import android.test.ActivityTestCase;
import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;
import android.test.mock.MockContext;

import com.money.manager.ex.MoneyManagerApplication;

/**
 * Test the methods in MoneyManagerApplication.
 *
 * Created by Alen Siljak on 22/09/2015.
 */
public class MmexApplicationTests
        extends AndroidTestCase {

    private Context context;

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    /**
     * This doesn't work as we need to get the settings key from the Resources.
     * @throws Exception
     */
    public void testCreateDefaultDatabaseName() throws Exception {
        String expected = "data.mmb";
        Context context = getContext();

        String actual = MoneyManagerApplication.getDatabasePath(context);

        assertEquals(expected, actual);
    }

    public Context getContext() {
//        MockContext context = new MockContext();

//        this.context = context;
//        setContext(context);


//        return getInstrumentation().getContext();
        return new MockContext();
    }
}