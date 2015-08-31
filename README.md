Stiletto
==========

[![Stiletto](https://upload.wikimedia.org/wikipedia/commons/0/06/Gunners_stiletto_01.jpg)](https://en.wikipedia.org/wiki/Stiletto)

The implmentation of Stiletto just in [one file](https://github.com/vinc3m1/stiletto/blob/master/library/src/main/kotlin/stiletto/Stiletto.kt), which you can just copy to your codebase instead of importing by maven or something fancy. The interesting parts are in the usage and configuration, which is what the sample app is for.

**Modules** are just [interfaces](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/ApplicationModule.kt) with stateless "provider" functions and wrapped with [`singleton`](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/data/DataModule.kt#L13) (and an optional [tag](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/data/DataModule.kt#L17)) if needed.

Module dependencies are defined by [abstract properties](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/ApplicationModule.kt#L11) to be passed in as [contructor params](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/ApplicationComponent.kt#L6), or [abstract methods](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/data/DataModule.kt#L11) to be fulfilled by other modules. Unfulfilled dependencies are thus checked compile time when creating the component.

[**Components**](https://github.com/vinc3m1/stiletto/blob/master/sample/src/main/kotlin/com/makeramen/stiletto/sample/ApplicationComponent.kt) are simply classes that use "multiple inheritance" of the Module interfaces and inherit [some abstract behavior](https://github.com/vinc3m1/stiletto/blob/master/library/src/main/kotlin/stiletto/Stiletto.kt#L17) to handle holding singletons. In most cases as in the example, they shouldn't contain any implmentation as that's already provided by the Module functions.

Component dependencies are fulfilled via [Class Delegation](http://kotlinlang.org/docs/reference/delegation.html).


License
=======

    Copyright 2015 Vincent Mi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
