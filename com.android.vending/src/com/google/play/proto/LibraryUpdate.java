/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Library.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.*;
import static com.squareup.wire.Message.Label.REPEATED;

public final class LibraryUpdate extends Message {

  public static final Integer DEFAULT_STATUS = 0;
  public static final Integer DEFAULT_CORPUS = 0;
  public static final ByteString DEFAULT_SERVERTOKEN = ByteString.EMPTY;
  public static final List<LibraryMutation> DEFAULT_MUTATION = Collections.emptyList();
  public static final Boolean DEFAULT_HASMORE = false;
  public static final String DEFAULT_LIBRARYID = "";

  @ProtoField(tag = 1, type = INT32)
  public final Integer status;

  @ProtoField(tag = 2, type = INT32)
  public final Integer corpus;

  @ProtoField(tag = 3, type = BYTES)
  public final ByteString serverToken;

  @ProtoField(tag = 4, label = REPEATED)
  public final List<LibraryMutation> mutation;

  @ProtoField(tag = 5, type = BOOL)
  public final Boolean hasMore;

  @ProtoField(tag = 6, type = STRING)
  public final String libraryId;

  public LibraryUpdate(Integer status, Integer corpus, ByteString serverToken, List<LibraryMutation> mutation, Boolean hasMore, String libraryId) {
    this.status = status;
    this.corpus = corpus;
    this.serverToken = serverToken;
    this.mutation = immutableCopyOf(mutation);
    this.hasMore = hasMore;
    this.libraryId = libraryId;
  }

  private LibraryUpdate(Builder builder) {
    this(builder.status, builder.corpus, builder.serverToken, builder.mutation, builder.hasMore, builder.libraryId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LibraryUpdate)) return false;
    LibraryUpdate o = (LibraryUpdate) other;
    return equals(status, o.status)
        && equals(corpus, o.corpus)
        && equals(serverToken, o.serverToken)
        && equals(mutation, o.mutation)
        && equals(hasMore, o.hasMore)
        && equals(libraryId, o.libraryId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = status != null ? status.hashCode() : 0;
      result = result * 37 + (corpus != null ? corpus.hashCode() : 0);
      result = result * 37 + (serverToken != null ? serverToken.hashCode() : 0);
      result = result * 37 + (mutation != null ? mutation.hashCode() : 1);
      result = result * 37 + (hasMore != null ? hasMore.hashCode() : 0);
      result = result * 37 + (libraryId != null ? libraryId.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<LibraryUpdate> {

    public Integer status;
    public Integer corpus;
    public ByteString serverToken;
    public List<LibraryMutation> mutation;
    public Boolean hasMore;
    public String libraryId;

    public Builder() {
    }

    public Builder(LibraryUpdate message) {
      super(message);
      if (message == null) return;
      this.status = message.status;
      this.corpus = message.corpus;
      this.serverToken = message.serverToken;
      this.mutation = copyOf(message.mutation);
      this.hasMore = message.hasMore;
      this.libraryId = message.libraryId;
    }

    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    public Builder corpus(Integer corpus) {
      this.corpus = corpus;
      return this;
    }

    public Builder serverToken(ByteString serverToken) {
      this.serverToken = serverToken;
      return this;
    }

    public Builder mutation(List<LibraryMutation> mutation) {
      this.mutation = checkForNulls(mutation);
      return this;
    }

    public Builder hasMore(Boolean hasMore) {
      this.hasMore = hasMore;
      return this;
    }

    public Builder libraryId(String libraryId) {
      this.libraryId = libraryId;
      return this;
    }

    @Override
    public LibraryUpdate build() {
      return new LibraryUpdate(this);
    }
  }
}