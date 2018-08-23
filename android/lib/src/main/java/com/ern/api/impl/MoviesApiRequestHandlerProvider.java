/*
* Copyright 2017 WalmartLabs
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.ern.api.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.ernmovie.ern.api.MoviesApi;
import com.ernmovie.ern.model.Movie;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;
import com.walmartlabs.electrode.reactnative.bridge.None;

import java.util.ArrayList;
import java.util.List;

/**
* This class is a generated place holder for your Movies implementations.!
* Feel free to modify this class contents as needed. `ern regen-api-impl` command WILL NOT modify the content of this class.
* Don't modify the class name as this naming convention is used for container generation.
*/
public class MoviesApiRequestHandlerProvider extends RequestHandlerProvider<MoviesApiRequestHandlerProvider.MoviesApiConfig> implements MoviesApiRequestHandler {

    /**
    * @param requestHandlerConfig : Optional config object that can be passed to an api impl provider.
    */
    MoviesApiRequestHandlerProvider(@Nullable MoviesApiRequestHandlerProvider.MoviesApiConfig requestHandlerConfig) {
        super(requestHandlerConfig);
    }

    @Override
    public void registerGetTopRatedMoviesRequestHandler() {
        MoviesApi.requests().registerGetTopRatedMoviesRequestHandler(new ElectrodeBridgeRequestHandler<None, List<Movie>>() {
            @Override
            public void onRequest(@Nullable None payload, @NonNull ElectrodeBridgeResponseListener<List<Movie>> responseListener) {
                List<Movie> movies = new ArrayList<Movie>() {{
                    add(new Movie.Builder("1", "The Shawshank Redemption").releaseYear(1994).rating(5f).imageUrl("http://bit.ly/2xZm1Zr").build());
                    add(new Movie.Builder("2", "The Godfather").releaseYear(1972).rating(4.9f).imageUrl("http://bit.ly/2wK5TuA").build());
                    add(new Movie.Builder("3", "The Godfather: Part II ").releaseYear(1974).rating(4f).imageUrl("http://bit.ly/2yysiIA").build());
                    add(new Movie.Builder("4", "The Dark Knight").releaseYear(2008).rating(4f).imageUrl("http://bit.ly/2iZPBqw").build());
                    add(new Movie.Builder("5", "12 Angry Men").releaseYear(1957).rating(3f).imageUrl("http://bit.ly/2xwkt7r").build());
                }};
                responseListener.onSuccess(movies);
            }
        });
    }

    @Override
    public void registerGetMovieDetailRequestHandler() {
        //TODO
    }

    // DO NOT rename this class as this naming convention is used when a container is generated.
    public static class MoviesApiConfig implements RequestHandlerConfig {

    }
}