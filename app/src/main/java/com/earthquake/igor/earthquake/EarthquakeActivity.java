/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.earthquake.igor.earthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("4.5", "San Francisco", "May, 25"));
        earthquakes.add(new Earthquake("5.0", "London", "Jun, first"));
        earthquakes.add(new Earthquake("5.2", "Tokyo", "Jun, first"));
        earthquakes.add(new Earthquake("5.1", "Mexico City", "Jun, second"));
        earthquakes.add(new Earthquake("7.0", "Moscow", "jun, second"));
        earthquakes.add(new Earthquake("4.5", "Rio de Janeiro", "jun, second"));
        earthquakes.add(new Earthquake("7.0", "Paris", "jun, first"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, 0, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
