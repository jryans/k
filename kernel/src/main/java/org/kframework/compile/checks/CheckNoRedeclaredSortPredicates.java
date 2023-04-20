// Copyright (c) K Team. All Rights Reserved.
package org.kframework.compile.checks;

import org.kframework.definition.ContextAlias;
import org.kframework.definition.Module;
import org.kframework.definition.Sentence;
import org.kframework.utils.errorsystem.KEMException;

import java.util.Set;

/**
 * Check that no sentence conflicts with the generated isSort predicates.
 * That is, it is an error to do both of:
 * - Declare a sort syntax S
 * - Declare a symbol syntax Bool ::= isS ( _ ).
 */
public class CheckNoRedeclaredSortPredicates {
    private final Set<KEMException> errors;

    public CheckNoRedeclaredSortPredicates(Set<KEMException> errors) {
        this.errors = errors;
    }

    public void check(Sentence sentence) {

    }
}

