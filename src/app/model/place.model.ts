export class Place {
    constructor(
        public photo_id?:number,
        public user_id?: number,
        public caption?: string,
        public latitude?: number,
        public longitude?: number,
        public image_path?: File,
        public image_size?: number,
        public date_created?: Date,
        public date_updated?: Date
    ) {}
    
    
}