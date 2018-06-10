/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.dbcp2.cpdsadapter;

import org.apache.commons.dbcp2.PStmtKey;

/**
 * A key uniquely identifying a {@link java.sql.PreparedStatement PreparedStatement}.
 *
 * @since 2.0
 * @deprecated Use {@link PStmtKey}.
 */
@Deprecated
public class PStmtKeyCPDS extends PStmtKey {
    public PStmtKeyCPDS(final String sql) {
        super(sql);
    }

    public PStmtKeyCPDS(final String sql, final int autoGeneratedKeys) {
        super(sql, null, autoGeneratedKeys);
    }

    public PStmtKeyCPDS(final String sql, final int resultSetType, final int resultSetConcurrency) {
        super(sql, resultSetType, resultSetConcurrency);
    }

    public PStmtKeyCPDS(final String sql, final int resultSetType, final int resultSetConcurrency,
            final int resultSetHoldability) {
        super(sql, resultSetType, resultSetConcurrency);
    }

    public PStmtKeyCPDS(final String sql, final int columnIndexes[]) {
        super(sql, null, columnIndexes);
    }

    public PStmtKeyCPDS(final String sql, final String columnNames[]) {
        super(sql, null, columnNames);
    }
}
