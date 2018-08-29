import { TestBed, inject } from '@angular/core/testing';

import { PlaceRepositoryService } from './place-repository.service';

describe('PlaceRepositoryService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PlaceRepositoryService]
    });
  });

  it('should be created', inject([PlaceRepositoryService], (service: PlaceRepositoryService) => {
    expect(service).toBeTruthy();
  }));
});
