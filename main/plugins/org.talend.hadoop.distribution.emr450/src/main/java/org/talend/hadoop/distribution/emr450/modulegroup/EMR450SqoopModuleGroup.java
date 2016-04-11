// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.emr450.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;

public class EMR450SqoopModuleGroup {

    public static final String MODULE_GROUP_NAME = "SQOOP-LIB-EMR_4_5_0_LATEST"; //$NON-NLS-1$

    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        hs.add(new DistributionModuleGroup(MODULE_GROUP_NAME));
        hs.add(new DistributionModuleGroup(EMR450MapReduceModuleGroup.MAPREDUCE_GROUP_NAME));
        hs.add(new DistributionModuleGroup(EMR450HDFSModuleGroup.MODULE_GROUP_NAME));
        return hs;
    }

}
