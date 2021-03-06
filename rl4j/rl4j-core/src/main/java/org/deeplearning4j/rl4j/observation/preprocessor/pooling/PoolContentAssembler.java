/*******************************************************************************
 * Copyright (c) 2015-2019 Skymind, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package org.deeplearning4j.rl4j.observation.preprocessor.pooling;

import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * A PoolContentAssembler is used with the PoolingDataSetPreProcessor. This interface defines how the array of INDArray
 * returned by the ObservationPool is packaged into the single INDArray that will be set
 * in the DataSet of PoolingDataSetPreProcessor.preProcess
 *
 * @author Alexandre Boulanger
 */
public interface PoolContentAssembler {
    INDArray assemble(INDArray[] poolContent);
}
